package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeSessionRgbConversionCreateInfoVALVE.class */
public class VkVideoEncodeSessionRgbConversionCreateInfoVALVE extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int RGBMODEL = 0;
    public static final int RGBRANGE = 0;
    public static final int XCHROMAOFFSET = 0;
    public static final int YCHROMAOFFSET = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE, org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
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
        protected org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
        public int rgbModel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
        public int rgbRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int xChromaOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int yChromaOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000390003(0x3ba0bd73, float:0.0049053966)
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer rgbModel(@org.lwjgl.system.NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer rgbRange(@org.lwjgl.system.NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer xChromaOffset(@org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer yChromaOffset(@org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7249create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeSessionRgbConversionCreateInfoVALVE(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
    public int rgbModel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrgbModel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
    public int rgbRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrgbRange(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int xChromaOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nxChromaOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int yChromaOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nyChromaOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000390003(0x3ba0bd73, float:0.0049053966)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(@org.lwjgl.system.NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrgbModel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(@org.lwjgl.system.NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrgbRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(@org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(@org.lwjgl.system.NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nyChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(int r5, long r6, int r8, int r9, int r10, int r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.rgbModel(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.rgbRange(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.xChromaOffset(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.yChromaOffset(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc() {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc() {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nrgbModel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBMODEL
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nrgbRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBRANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nxChromaOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.XCHROMAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nyChromaOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.YCHROMAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrgbModel(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBMODEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nrgbRange(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBRANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nxChromaOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.XCHROMAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nyChromaOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.YCHROMAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBMODEL = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBRANGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.XCHROMAOFFSET = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeSessionRgbConversionCreateInfoVALVE.YCHROMAOFFSET = r0
            return
    }
}
