package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesEXT.class */
public class VkVideoEncodeH265CapabilitiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int MAXLEVELIDC = 0;
    public static final int MAXSLICESEGMENTCOUNT = 0;
    public static final int MAXTILES = 0;
    public static final int CTBSIZES = 0;
    public static final int TRANSFORMBLOCKSIZES = 0;
    public static final int MAXPPICTUREL0REFERENCECOUNT = 0;
    public static final int MAXBPICTUREL0REFERENCECOUNT = 0;
    public static final int MAXL1REFERENCECOUNT = 0;
    public static final int MAXSUBLAYERCOUNT = 0;
    public static final int EXPECTDYADICTEMPORALSUBLAYERPATTERN = 0;
    public static final int MINQP = 0;
    public static final int MAXQP = 0;
    public static final int PREFERSGOPREMAININGFRAMES = 0;
    public static final int REQUIRESGOPREMAININGFRAMES = 0;
    public static final int STDSYNTAXFLAGS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT, org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxLevelIdc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSliceSegmentCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxSliceSegmentCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxTiles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxTiles(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nctbSizes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
        public int transformBlockSizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxL1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSubLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nexpectDyadicTemporalSubLayerPattern(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int minQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nminQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int maxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nmaxQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nprefersGopRemainingFrames(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nrequiresGopRemainingFrames(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH265StdFlagsEXT")
        public int stdSyntaxFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nstdSyntaxFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000039000(0x3b9b6258, float:0.004741948)
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH265CapabilitiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH265CapabilitiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxLevelIdc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSliceSegmentCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSliceSegmentCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxTiles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxTiles(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nctbSizes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
    public int transformBlockSizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransformBlockSizes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPPictureL0ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxBPictureL0ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxL1ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxL1ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSubLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSubLayerCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean expectDyadicTemporalSubLayerPattern() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nexpectDyadicTemporalSubLayerPattern(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int minQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nminQp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int maxQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxQp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprefersGopRemainingFrames(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrequiresGopRemainingFrames(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeH265StdFlagsEXT")
    public int stdSyntaxFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstdSyntaxFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000039000(0x3b9b6258, float:0.004741948)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT set(org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxLevelIdc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXLEVELIDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxSliceSegmentCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXSLICESEGMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxTiles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXTILES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nctbSizes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.CTBSIZES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntransformBlockSizes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPPictureL0ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxBPictureL0ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxL1ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxSubLayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nexpectDyadicTemporalSubLayerPattern(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.EXPECTDYADICTEMPORALSUBLAYERPATTERN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nminQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MINQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersGopRemainingFrames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.PREFERSGOPREMAININGFRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrequiresGopRemainingFrames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.REQUIRESGOPREMAININGFRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstdSyntaxFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.STDSYNTAXFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 18
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXLEVELIDC = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXSLICESEGMENTCOUNT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXTILES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.CTBSIZES = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERCOUNT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.EXPECTDYADICTEMPORALSUBLAYERPATTERN = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MINQP = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.MAXQP = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.PREFERSGOPREMAININGFRAMES = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.REQUIRESGOPREMAININGFRAMES = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265CapabilitiesEXT.STDSYNTAXFLAGS = r0
            return
    }
}
