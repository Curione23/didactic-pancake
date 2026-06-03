package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesEXT.class */
public class VkVideoEncodeH264CapabilitiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int MAXLEVELIDC = 0;
    public static final int MAXSLICECOUNT = 0;
    public static final int MAXPPICTUREL0REFERENCECOUNT = 0;
    public static final int MAXBPICTUREL0REFERENCECOUNT = 0;
    public static final int MAXL1REFERENCECOUNT = 0;
    public static final int MAXTEMPORALLAYERCOUNT = 0;
    public static final int EXPECTDYADICTEMPORALLAYERPATTERN = 0;
    public static final int MINQP = 0;
    public static final int MAXQP = 0;
    public static final int PREFERSGOPREMAININGFRAMES = 0;
    public static final int REQUIRESGOPREMAININGFRAMES = 0;
    public static final int STDSYNTAXFLAGS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT, org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxLevelIdc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSliceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxSliceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxPPictureL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxBPictureL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxL1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxL1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTemporalLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxTemporalLayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean expectDyadicTemporalLayerPattern() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nexpectDyadicTemporalLayerPattern(r0)
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
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nminQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int maxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nmaxQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nprefersGopRemainingFrames(r0)
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
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nrequiresGopRemainingFrames(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH264StdFlagsEXT")
        public int stdSyntaxFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nstdSyntaxFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000038000(0x3b9b5e70, float:0.0047414824)
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH264CapabilitiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH264CapabilitiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxLevelIdc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSliceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSliceCount(r0)
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
    public int maxTemporalLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTemporalLayerCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean expectDyadicTemporalLayerPattern() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nexpectDyadicTemporalLayerPattern(r0)
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

    @org.lwjgl.system.NativeType("VkVideoEncodeH264StdFlagsEXT")
    public int stdSyntaxFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstdSyntaxFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000038000(0x3b9b5e70, float:0.0047414824)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT set(org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxLevelIdc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXLEVELIDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxSliceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXSLICECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPPictureL0ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxBPictureL0ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxL1ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXL1REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxTemporalLayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXTEMPORALLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nexpectDyadicTemporalLayerPattern(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.EXPECTDYADICTEMPORALLAYERPATTERN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nminQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MINQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersGopRemainingFrames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.PREFERSGOPREMAININGFRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrequiresGopRemainingFrames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.REQUIRESGOPREMAININGFRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstdSyntaxFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.STDSYNTAXFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.PNEXT
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
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXLEVELIDC = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXSLICECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXL1REFERENCECOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXTEMPORALLAYERCOUNT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.EXPECTDYADICTEMPORALLAYERPATTERN = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MINQP = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.MAXQP = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.PREFERSGOPREMAININGFRAMES = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.REQUIRESGOPREMAININGFRAMES = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264CapabilitiesEXT.STDSYNTAXFLAGS = r0
            return
    }
}
