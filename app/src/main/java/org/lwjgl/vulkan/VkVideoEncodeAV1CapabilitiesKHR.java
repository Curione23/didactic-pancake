package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeAV1CapabilitiesKHR.class */
public class VkVideoEncodeAV1CapabilitiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int MAXLEVEL = 0;
    public static final int CODEDPICTUREALIGNMENT = 0;
    public static final int MAXTILES = 0;
    public static final int MINTILESIZE = 0;
    public static final int MAXTILESIZE = 0;
    public static final int SUPERBLOCKSIZES = 0;
    public static final int MAXSINGLEREFERENCECOUNT = 0;
    public static final int SINGLEREFERENCENAMEMASK = 0;
    public static final int MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = 0;
    public static final int MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = 0;
    public static final int UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = 0;
    public static final int MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = 0;
    public static final int MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = 0;
    public static final int MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = 0;
    public static final int BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = 0;
    public static final int MAXTEMPORALLAYERCOUNT = 0;
    public static final int MAXSPATIALLAYERCOUNT = 0;
    public static final int MAXOPERATINGPOINTS = 0;
    public static final int MINQINDEX = 0;
    public static final int MAXQINDEX = 0;
    public static final int PREFERSGOPREMAININGFRAMES = 0;
    public static final int REQUIRESGOPREMAININGFRAMES = 0;
    public static final int STDSYNTAXFLAGS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeAV1CapabilitiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR, org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
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
        protected org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1Level")
        public int maxLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxLevel(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D codedPictureAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ncodedPictureAlignment(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxTiles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxTiles(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D minTileSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nminTileSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxTileSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxTileSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int superblockSizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nsuperblockSizes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSingleReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxSingleReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int singleReferenceNameMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nsingleReferenceNameMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxUnidirectionalCompoundReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxUnidirectionalCompoundGroup1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundGroup1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int unidirectionalCompoundReferenceNameMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nunidirectionalCompoundReferenceNameMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxBidirectionalCompoundReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup2ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup2ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bidirectionalCompoundReferenceNameMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nbidirectionalCompoundReferenceNameMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTemporalLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxTemporalLayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSpatialLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxSpatialLayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxOperatingPoints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxOperatingPoints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int minQIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nminQIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxQIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nmaxQIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nprefersGopRemainingFrames(r0)
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
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nrequiresGopRemainingFrames(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeAV1StdFlagsKHR")
        public int stdSyntaxFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nstdSyntaxFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000513000(0x3ba29de8, float:0.0049626715)
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7004create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeAV1CapabilitiesKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeAV1CapabilitiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1Level")
    public int maxLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxLevel(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D codedPictureAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = ncodedPictureAlignment(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxTiles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxTiles(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D minTileSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nminTileSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxTileSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxTileSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int superblockSizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsuperblockSizes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSingleReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSingleReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int singleReferenceNameMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsingleReferenceNameMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxUnidirectionalCompoundReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxUnidirectionalCompoundReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxUnidirectionalCompoundGroup1ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxUnidirectionalCompoundGroup1ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int unidirectionalCompoundReferenceNameMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nunidirectionalCompoundReferenceNameMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxBidirectionalCompoundReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxBidirectionalCompoundReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup1ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxBidirectionalCompoundGroup1ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup2ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxBidirectionalCompoundGroup2ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bidirectionalCompoundReferenceNameMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbidirectionalCompoundReferenceNameMask(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSpatialLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSpatialLayerCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxOperatingPoints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxOperatingPoints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int minQIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nminQIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxQIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxQIndex(r0)
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

    @org.lwjgl.system.NativeType("VkVideoEncodeAV1StdFlagsKHR")
    public int stdSyntaxFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstdSyntaxFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000513000(0x3ba29de8, float:0.0049626715)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR set(org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR malloc() {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR calloc() {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxLevel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D ncodedPictureAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.CODEDPICTUREALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxTiles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTILES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nminTileSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MINTILESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxTileSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTILESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nsuperblockSizes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SUPERBLOCKSIZES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxSingleReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXSINGLEREFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsingleReferenceNameMask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SINGLEREFERENCENAMEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxUnidirectionalCompoundReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxUnidirectionalCompoundGroup1ReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nunidirectionalCompoundReferenceNameMask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxBidirectionalCompoundReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxBidirectionalCompoundGroup1ReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxBidirectionalCompoundGroup2ReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbidirectionalCompoundReferenceNameMask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxTemporalLayerCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTEMPORALLAYERCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxSpatialLayerCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXSPATIALLAYERCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxOperatingPoints(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXOPERATINGPOINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nminQIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MINQINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxQIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXQINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nprefersGopRemainingFrames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.PREFERSGOPREMAININGFRAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nrequiresGopRemainingFrames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstdSyntaxFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.STDSYNTAXFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 26
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXLEVEL = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.CODEDPICTUREALIGNMENT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTILES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MINTILESIZE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTILESIZE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SUPERBLOCKSIZES = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXSINGLEREFERENCECOUNT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.SINGLEREFERENCENAMEMASK = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXTEMPORALLAYERCOUNT = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXSPATIALLAYERCOUNT = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXOPERATINGPOINTS = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MINQINDEX = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.MAXQINDEX = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.PREFERSGOPREMAININGFRAMES = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1CapabilitiesKHR.STDSYNTAXFLAGS = r0
            return
    }
}
