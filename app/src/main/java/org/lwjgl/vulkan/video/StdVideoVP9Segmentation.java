package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoVP9Segmentation.class */
public class StdVideoVP9Segmentation extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoVP9Segmentation> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int SEGMENTATION_TREE_PROBS = 0;
    public static final int SEGMENTATION_PRED_PROB = 0;
    public static final int FEATUREENABLED = 0;
    public static final int FEATUREDATA = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoVP9Segmentation$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoVP9Segmentation, org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoVP9Segmentation ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoVP9Segmentation getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
        public java.nio.ByteBuffer segmentation_tree_probs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_tree_probs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte segmentation_tree_probs(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_tree_probs(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
        public java.nio.ByteBuffer segmentation_pred_prob() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_pred_prob(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte segmentation_pred_prob(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_pred_prob(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
        public java.nio.ByteBuffer FeatureEnabled() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureEnabled(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte FeatureEnabled(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureEnabled(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
        public java.nio.ShortBuffer FeatureData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int16_t")
        public short FeatureData(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureData(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer flags(org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer segmentation_tree_probs(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_tree_probs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer segmentation_tree_probs(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_tree_probs(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer segmentation_pred_prob(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_pred_prob(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer segmentation_pred_prob(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nsegmentation_pred_prob(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer FeatureEnabled(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureEnabled(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer FeatureEnabled(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureEnabled(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer FeatureData(@org.lwjgl.system.NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer FeatureData(int r6, @org.lwjgl.system.NativeType("int16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.nFeatureData(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7558create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.create(r0)
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoVP9Segmentation(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoVP9Segmentation create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoVP9Segmentation(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
    public java.nio.ByteBuffer segmentation_tree_probs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nsegmentation_tree_probs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte segmentation_tree_probs(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nsegmentation_tree_probs(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
    public java.nio.ByteBuffer segmentation_pred_prob() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nsegmentation_pred_prob(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte segmentation_pred_prob(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nsegmentation_pred_prob(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
    public java.nio.ByteBuffer FeatureEnabled() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nFeatureEnabled(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte FeatureEnabled(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nFeatureEnabled(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
    public java.nio.ShortBuffer FeatureData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nFeatureData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int16_t")
    public short FeatureData(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nFeatureData(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation flags(org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation segmentation_tree_probs(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsegmentation_tree_probs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation segmentation_tree_probs(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nsegmentation_tree_probs(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation segmentation_pred_prob(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsegmentation_pred_prob(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation segmentation_pred_prob(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nsegmentation_pred_prob(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation FeatureEnabled(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nFeatureEnabled(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation FeatureEnabled(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nFeatureEnabled(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation FeatureData(@org.lwjgl.system.NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nFeatureData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation FeatureData(int r6, @org.lwjgl.system.NativeType("int16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nFeatureData(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation set(org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r4, java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, java.nio.ShortBuffer r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.segmentation_tree_probs(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.segmentation_pred_prob(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.FeatureEnabled(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.FeatureData(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation set(org.lwjgl.vulkan.video.StdVideoVP9Segmentation r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation malloc() {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation calloc() {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation create(long r6) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoVP9Segmentation$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r0 = org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags.create(r0)
            return r0
    }

    public static java.nio.ByteBuffer nsegmentation_tree_probs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nsegmentation_tree_probs(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nsegmentation_pred_prob(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nsegmentation_pred_prob(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nFeatureEnabled(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREENABLED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nFeatureEnabled(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREENABLED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ShortBuffer nFeatureData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nFeatureData(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsegmentation_tree_probs(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsegmentation_tree_probs(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nsegmentation_pred_prob(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsegmentation_pred_prob(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nFeatureEnabled(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREENABLED
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nFeatureEnabled(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREENABLED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nFeatureData(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nFeatureData(long r7, int r9, short r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoVP9SegmentationFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREENABLED = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation.FEATUREDATA = r0
            return
    }
}
